import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class VotingSystemTest {

    private VotingSystem votingSystem;

    @Before
    public void setUp() {
        votingSystem = new VotingSystem();
        votingSystem.addCandidate("Candidate A");
        votingSystem.addCandidate("Candidate B");
    }

    @Test
    public void testVoteForCandidate() {
        votingSystem.voteForCandidate("Candidate A");
        assertEquals(1, votingSystem.getCandidateVotes("Candidate A"));
    }

    @Test
    public void testVoteForNonExistentCandidate() {
        votingSystem.voteForCandidate("Candidate C");
        assertEquals(0, votingSystem.getCandidateVotes("Candidate C"));
    }

    @Test
    public void testMultipleVotesForCandidate() {
        votingSystem.voteForCandidate("Candidate A");
        votingSystem.voteForCandidate("Candidate A");
        assertEquals(2, votingSystem.getCandidateVotes("Candidate A"));
    }

    @Test
    public void testAddCandidate() {
        votingSystem.addCandidate("Candidate C");
        assertEquals(0, votingSystem.getCandidateVotes("Candidate C"));
    }
}
