package seedu.address.logic.commands.student;

import seedu.address.logic.commands.CommandResult;
import seedu.address.logic.commands.CopyCommand;
import seedu.address.logic.commands.descriptors.CopyCommandDescriptor;
import seedu.address.model.Model;
import seedu.address.model.person.student.Student;

import java.util.List;

import static java.util.Objects.requireNonNull;

public class CopyStudentCommand extends CopyCommand {

    public static final String COMMAND_WORD = "copyStudent";

    /**
     * Constructor for {@code CopyStudentCommand}
     *
     * @param copyCommandDescriptor the {@code copyCommandDescriptor to specify which field to copy}
     */

    public CopyStudentCommand(CopyCommandDescriptor copyCommandDescriptor) {
        super(copyCommandDescriptor);
    }

    @Override
    public CommandResult execute(Model model) {
        requireNonNull(model);
        List<Student> lastShownList = model.getFilteredStudentList();
        copyToClipBoard(lastShownList);
        return new CommandResult(MESSAGE_SUCCESS);
    }

}
