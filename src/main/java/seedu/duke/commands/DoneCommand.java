package seedu.duke.commands;

import seedu.duke.exception.DukeException;
import seedu.duke.storage.Storage;
import seedu.duke.ui.Ui;

public class DoneCommand extends Command {

    public static final String COMMAND_WORD = "done";
    public static final String DONE_MSG = "Nice! I have marked this task as done: \n\t";

    public DoneCommand(boolean isExit, String description) {
        super(isExit, description);
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        int index = 0;
        try {
            if (description.substring(4).equals("")){ //if after keywords is empty
                throw new DukeException("\t☹ OOPS!!! The description of todo cannot be empty.\n");
            }
            index = Integer.parseInt(description.substring(5))-1;
            (taskList.getATask(index)).setDone();
            ui.showOutputToUser(DONE_MSG + taskList.getATask(index));
            storage.save();
        }catch (DukeException | Storage.StorageOperationException e){
            System.out.println("\t____________________________________________________________");
            System.out.println("\t☹ OOPS!!! The number of task cannot be empty.2");
            System.out.println("\t____________________________________________________________");
        }
    }
}