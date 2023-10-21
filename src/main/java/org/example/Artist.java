package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.regex.*;

public class Artist implements Serializable {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList <String >  Occupations;
    private ArrayList <String> Awards;
    private ArrayList <String> Genres;

    public Artist(String id, String name, String address, String birthdate, String bio,
                  ArrayList <String> occupations, ArrayList <String> genres, ArrayList <String> awards) {
            ID = id;
            Name = name;
            Address = address;
            Birthdate = birthdate;
            Bio = bio;
            Occupations = occupations;
            Genres = genres;
            Awards = awards;
        }

    @Override
    public String toString() {
        return "Artist{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Birthdate='" + Birthdate + '\'' +
                ", Bio='" + Bio + '\'' +
                ", Occupations=" + Occupations +
                ", Awards=" + Awards +
                ", Genres=" + Genres +
                '}';
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getBio() {
        return Bio;
    }

    public void setBio(String bio) {
        Bio = bio;
    }

    public ArrayList<String> getOccupations() {
        return Occupations;
    }

    public void setOccupations(ArrayList<String> occupations) {
        Occupations = occupations;
    }

    public ArrayList<String> getAwards() {
        return Awards;
    }

    public void setAwards(ArrayList<String> awards) {
        Awards = awards;
    }

    public ArrayList<String> getGenres() {
        return Genres;
    }

    public void setGenres(ArrayList<String> genres) {
        Genres = genres;
    }

    public boolean addArtist (){
         boolean isValid = velidation1();
        System.out.println("++++++"+isValid);
        if(isValid){
            return writeToFile("./"+this.ID+".txt", this);
        }
        return false;
    }

    public boolean updateArtist(){
        boolean isValid = velidation2();
        if(isValid){
            return writeToFile("./"+this.ID+".txt", this);
        }
        return false;
    }

    public boolean velidation1() {

        if(!this.isValidateID()) {
            System.out.println("❌Invalid Id");
            return false;
        }

        if(!Pattern.matches("[0-3]{1}[0-9]{1}-[0-1]{1}[0-9]{1}-\\d{4}", this.Birthdate)) {
            System.out.println("❌Invalid BirthDate");
            return false;
        }

        if(!Pattern.matches("\\w+\\|\\w+\\|\\w+", this.Address )){
            System.out.println("❌Invalid Address");
            return false;
        }


            String[] listOfWord = this.Bio.trim().split(" ");
        System.out.println(listOfWord.length);
        if (listOfWord.length < 10 || listOfWord.length > 30) {
            System.out.println("❌ Bio Length");
            return false; // The bio of the artist should be between 10 to 30 words
        }

        if (this.Occupations.size() == 0 || this.Occupations.size() > 5){
            System.out.println("❌Invalid Occupation");
            return false; //. An artist should have at least one occupation or a maximum of five occupations
        }

        if (this.Awards.size() > 3){
            System.out.println("❌Invalid Award Size");
            return false; //An artist can have zero to a maximum of three awards.
        }

        for(String award : Awards) {
            if(!Pattern.matches("\\d{4}, .+", award)) {
                System.out.println("❌Invalid award patern for" + award);
                return false;
            }
        }

        if (this.Genres.size() < 2 || this.Genres.size() > 5){
            System.out.println("❌Invalid Genres size");
            return false; // An artist should be active in at least two music genres and a maximum of five genres.
        }
        else if (this.Genres.size() <= 5) { //Artists cannot be active in 'pop' and'rock' genres at the same time.
            int count = 0;
            for (String genre : this.Genres) {
                if (genre.equalsIgnoreCase("pop") || genre.equalsIgnoreCase("rock")) count++;
            }
            if (count >= 2) {
                System.out.println("❌Invalid Genres pop and rock in same Genres");
                return false;
            }
        }
        return true;
    }

    public boolean isValidateID() {
        if (this.ID.length() != 10) return false; // length of ID should be 10
        System.out.println("&&&&&&"+Pattern.matches("[5-9]{3}[A-Z]{1}\\S{3}[A-Z]{1}[^A-Za-z0-9\\s]{2}", this.ID));
        if(!Pattern.matches("[5-9]{3}[A-Z]{1}\\S{3}[A-Z]{1}[^A-Za-z0-9\\s]{2}", this.ID)) return false;
        return true;
    }

    public boolean writeToFile(String path, Artist obj){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
            System.out.println("successfully wrote to file");
            return true;
        }
        catch (IOException e) {
            System.out.print(e.getMessage());
            return false;
        }
    }

    public Artist reafFile (String path) {
        try {
            FileInputStream fis = new FileInputStream("./"+path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Artist artist = (Artist) ois.readObject();
            System.out.println("inside read file*****"+artist.toString());
            return artist;
        }catch (Exception e){
            System.out.println("READ failed ----");
            e.printStackTrace();
            return null;
        }
    }

    public boolean velidation2(){
        if (!this.velidation1()) return false;
        Artist artist = reafFile(this.ID+".txt");

        if(artist==null){
            System.out.println("❌No Artist with ID found");
            return false;
        }
        System.out.println("old data   "+artist.toString());
        int YearOfBirthPast = Integer.parseInt(artist.Birthdate.substring(6));
        int year = Integer.parseInt(this.Birthdate.substring(6));
        if(!artist.getOccupations().equals(this.getOccupations()) && (YearOfBirthPast<2000)){
            System.out.println("❌Invalid Because Trying to change occupations when DOB is <2000");
            return false;
        }
        if(!artist.getAwards().equals(this.getAwards())){
            if(artist.getAwards().size() < this.getAwards().size()){
                System.out.println("❌Can Not Deleate an Award");
                return false;
            }
            for(int i = 0; i<artist.getAwards().size(); i++){
                String aBefore = artist.getAwards().get(i);
                String aAfter = this.getAwards().get(i);
                if(!aBefore.equals(aAfter)){
                    int yBefore = Integer.parseInt(aBefore.substring(0,4));
                    int yAfter = Integer.parseInt(aAfter.substring(0,4));
                    if(yBefore<2000 || (yBefore!=yAfter)) {
                        System.out.println("❌Invalid Can Not update year of award");
                        return false;
                    }
                }
            }
        }
        System.out.println("New Data "+this.toString());
        return true;
    }
}