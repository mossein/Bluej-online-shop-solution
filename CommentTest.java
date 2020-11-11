

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
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
    public void downvote()
    {
        Comment c1 = new Comment("Mo", "Perfect", 4);
        c1.upvote();
        c1.upvote();
        c1.upvote();
        c1.upvote();
        c1.upvote();
        c1.downvote();
        assertEquals(4, c1.getVoteCount());
    }

    @Test
    public void getRating()
    {
        Comment c2 = new Comment("Mel", " Strongly Recommended", 5);
        c2.upvote();
        c2.upvote();
        c2.downvote();
        assertEquals(5, c2.getRating());
    }
}


