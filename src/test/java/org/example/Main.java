import org.example.Artist;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Main {
    Artist A = new Artist("124TREM@#", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist A_1 = new Artist("567MMRTV12", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist A_2 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );

    Artist B_1 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-13-20014", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist B_2 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-13-2001", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist C_1 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist C_2 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs. I am a very talented artist and have made many songs.",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist D_1 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist D_2 = new Artist("789SEEMA!@", "Micheal", "melborne@@|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist E_1 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("singer","songwriter")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist E_2 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer", "Singer", "songwriter","Composer", "Guitarist","Disk Jockey", "Record Produce")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist F_1 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("singer","songwriter")),
            new ArrayList<String>(Arrays.asList("blues","jazz", "pop")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist F_2 = new Artist("789SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very talented artist I am a very good singer",
            new ArrayList<String>(Arrays.asList("singer","songwriter")),
            new ArrayList<String>(Arrays.asList("pop","rock", "disco","funk")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist G = new Artist("786VINOD@#", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist G_1 = new Artist("786VINO@#", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist G_2 = new Artist("786MMRTV25", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist I = new Artist("787SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist I_1 = new Artist("787SEEMA!@", "Micheal", "mel|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist I_2 = new Artist("787SEEMA!@", "Micheal", "indore|mp$$|india", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist J = new Artist("788SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "Sarah Lucas in a British artist Sarah Lucas in a British artist",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist J_1 = new Artist("788SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "Sarah Lucas in a British artist Sarah Lucas in a British artist",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist J_2 = new Artist("788SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "Sarah Lucas is a contemporary British artist known for her kinaesthetic photographs, performances, and sculpture. Appropriating commonplace materials, the artist creates crude and often inflammatory comments on sexuality, death, and gender. She is recognized as among the most prominent members of the Young British Artists",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist K = new Artist("799SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("pop","ska", "dubstep")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist K_1 = new Artist("799SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("pop","ska", "dubstep")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist K_2 = new Artist("799SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("pop","hardstyle", "rock","funk")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist L_After_2000 = new Artist("896SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2013", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist L_1 = new Artist("896SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("Singer","Pianist","Drummer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist L_Before_2000 = new Artist("897SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-1998", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist L_2 = new Artist("897SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","Producer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist M_After_2000 = new Artist("678SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2013", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist M_1 = new Artist("678SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-2023", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Gramy","2222, Emyy"))
    );
    Artist M_Before_2000 = new Artist("679SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-1998", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Grammy","2222, Emmyy"))
    );
    Artist M_2 = new Artist("679SEEMA!@", "Micheal", "melborne|victoria|australia", "31-05-1998", "I am a very good singer I am a very good singer",
            new ArrayList<String>(Arrays.asList("songwriter","drumer")),
            new ArrayList<String>(Arrays.asList("Blues","rock", "jazz")),
            new ArrayList<String>(Arrays.asList("2021, Gramy","2222, Eyy"))
    );
   @Test
    public void testAddArtist_Testcase1_Testdata1() {assertEquals(A.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase1_Testdata2() {assertEquals(A_1.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase1_Testdata3() {assertEquals(A_2.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase2_Testdata1() {assertEquals(B_1.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase2_Testdata2() {assertEquals(B_2.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase3_Testdata1() {assertEquals(C_1.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase3_Testdata2() {assertEquals(C_2.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase4_Testdata1() {assertEquals(D_1.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase4_Testdata2() {assertEquals(D_2.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase5_Testdata1() {assertEquals(E_1.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase5_Testdata2() {assertEquals(E_2.addArtist(), false); }
    @Test
    public void testAddArtist_Testcase6_Testdata1() {assertEquals(F_1.addArtist(), true); }
    @Test
    public void testAddArtist_Testcase6_Testdata2() {assertEquals(F_2.addArtist(), false); }

    @Test
    public void testAddArtist_Testcase1() {assertEquals(G.addArtist(), true); }
    @Test
    public void testUpdateArtist_Testcase1_Testdata1() {
       assertEquals(G_1.updateArtist(), false);
    }
    @Test
    public void testUpdateArtist_Testcase1_Testdata2() {
        assertEquals(G_2.updateArtist(), false);
    }
    @Test
    public void testAddArtist_Testcase2() {assertEquals(I.addArtist(), true); }
    @Test
    public void testUpdateArtist_Testcase2_Testdata1() { assertEquals(I_1.updateArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase2_Testdata2() {
        assertEquals(I_2.updateArtist(), false);
    }
    @Test
    public void testAddArtist_Testcase3() {assertEquals(J.addArtist(), true); }
    @Test
    public void testUpdateArtist_Testcase3_Testdata1() {
        assertEquals(J_1.updateArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase3_Testdata2() {
        assertEquals(J_2.updateArtist(), false);
    }
    @Test
    public void testAddArtist_Testcase4() {assertEquals(K.addArtist(), true); }
    @Test
    public void testUpdateArtist_Testcase4_Testdata1() {
        assertEquals(K_1.updateArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase4_Testdata2() {
        assertEquals(K_2.updateArtist(), false);
    }
    @Test
    public void testAddArtistafter2000() { assertEquals(L_After_2000.addArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase5_Testdata1() {
        assertEquals(L_1.updateArtist(), true);
    }
    @Test
    public void testAddArtistbefore2000() { assertEquals(L_Before_2000.addArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase5_Testdata2() {
        assertEquals(L_2.updateArtist(), false);
    }
    @Test
    public void testAddArtistafter2000_1() {
        assertEquals(M_After_2000.addArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase6_Testdata1() {
        assertEquals(M_1.updateArtist(), true);
    }
    @Test
    public void testAddArtistbefore2000_1() {
        assertEquals(M_Before_2000.addArtist(), true);
    }
    @Test
    public void testUpdateArtist_Testcase6_Testdata2() {
        assertEquals(M_2.updateArtist(), true);
    }

}

