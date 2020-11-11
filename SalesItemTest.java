

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void SalesItem()
    {
        SalesItem salesIte1 = new SalesItem("bag", 20);
        assertEquals("bag", salesIte1.getName());
        assertEquals(20, salesIte1.getPrice());
    }

    @Test
    public void getNumberOfComments()
    {
        SalesItem salesIte1 = new SalesItem("Phone", 100);
        salesIte1.addComment("Fume", "I hated the phone!", 1);
        salesIte1.addComment("Mohammad", "I loved it!", 5);
        assertEquals(2, salesIte1.getNumberOfComments());
    }

    @Test
    public void removeComment()
    {
        SalesItem salesIte1 = new SalesItem("Tesla Model X", 999999);
        salesIte1.addComment("Mohammad", "Best Purchase Ever!", 5);
        salesIte1.addComment("Asal", "How this things drive?", 1);
        salesIte1.removeComment(1);
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    @Test
    public void addComent()
    {
        SalesItem s1 = new SalesItem("Bag", 200);
        assertEquals(true, s1.addComment("Mo", "BEST BAG EVER!", 5));
        assertEquals(false, s1.addComment("Mo", "JK, wasn't that good!", 1));
        assertEquals(false, s1.addComment("Fume", "Perfect bag", 7));
        assertEquals(false, s1.addComment("Mike", "worst", 0));
    }

    @Test
    public void upvoteComment()
    {
        SalesItem salesIte1 = new SalesItem("Bag", 200);
        salesIte1.addComment("Mo", "Best Purchase", 5);
        salesIte1.addComment("Mel", "Not bad", 3);
        salesIte1.addComment("Joe", "Not good at all", 1);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(1);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(2);
        assertEquals("Mo", salesIte1.findMostHelpfulComment().getAuthor());
    }

    @Test
    public void downvoteComment()
    {
        SalesItem s1 = new SalesItem("bag", 200);
        s1.addComment("Mo", "Liked it", 4);
        s1.addComment("Mel", "Awesome", 5);
        s1.addComment("George", "Do not buy this, It is fraud!", 1);
        s1.downvoteComment(2);
        s1.downvoteComment(2);
        assertEquals("Mo", s1.findMostHelpfulComment().getAuthor());
    }

    @Test
    public void ratingInvalid()
    {
        SalesItem s1 = new SalesItem("Bag", 200);
        assertEquals(false, s1.addComment("Fume", "Not good", -1));
        assertEquals(false, s1.addComment("Mel", "Really good", 7));
    }

    

    @Test
    public void findMostHelpfulComment()
    {
        SalesItem s1 = new SalesItem("Bag", 200);
    }
}









