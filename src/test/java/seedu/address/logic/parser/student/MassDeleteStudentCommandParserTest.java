package seedu.address.logic.parser.student;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.student.MassDeleteStudentCommand;


public class MassDeleteStudentCommandParserTest {

    private MassDeleteStudentCommandParser parser = new MassDeleteStudentCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                MassDeleteStudentCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_validArgs_returnsCommand() {
        // no leading and trailing whitespaces
        MassDeleteStudentCommand expectedFilterCommand =
                new MassDeleteStudentCommand((Arrays.asList("Alice",
                        "Bob")));
        assertParseSuccess(parser, "Alice Bob", expectedFilterCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " \n Alice \n \t Bob  \t", expectedFilterCommand);
    }

}
