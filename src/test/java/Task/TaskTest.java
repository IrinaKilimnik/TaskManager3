package Task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        Boolean actual = simpleTask.matches("Позвонить");
        Boolean expected = true;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertTrue(actual);

    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");


        Boolean actual = simpleTask.matches("Купить");
        Boolean expected = false;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingTopicMatches() {
        Meeting Meeting = new Meeting(5, "Доклад о достигнутых результатах за полугодие", "Полугодовое собрание", "Завтра в 11");


        Boolean actual = Meeting.matches("Доклад о достигнутых результатах за полугодие");
        Boolean expected = true;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertTrue(actual);

    }

    @Test
    public void testMeetingProjectMatches() {
        Meeting Meeting = new Meeting(5, "Доклад о достигнутых результатах за полугодие", "Полугодовое собрание", "Завтра в 11");


        Boolean actual = Meeting.matches("Полугодовое собрание");
        Boolean expected = true;


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMeetingNotMatches() {
        Meeting Meeting = new Meeting(5, "Доклад о достигнутых результатах за полугодие", "Полугодовое собрание", "Завтра в 11");


        Boolean actual = Meeting.matches("Погулять с собакой");
        Boolean expected = false;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertTrue(actual);

    }

    @Test
    public void testEpicMatches() {
        Epic Epic = new Epic(5, new String[]{"Погулять с собакой", "Купить мыло", "Прочитать главу книги"});


        Boolean actual = Epic.matches("Погулять с собакой");
        Boolean expected = true;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertTrue(actual);

    }

    @Test
    public void testEpicNotMatches() {
        Epic Epic = new Epic(5, new String[]{"Погулять с собакой", "Купить мыло", "Прочитать главу книги"});


        Boolean actual = Epic.matches("Купить собаку");
        Boolean expected = false;


        Assertions.assertEquals(expected, actual);

        // Assertions.assertFalse(actual);

    }
}
