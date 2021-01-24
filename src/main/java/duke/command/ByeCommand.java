package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public class ByeCommand extends Command {

    private static final String ERROR_MESSAGE = "Wait, you want to leave or what?";


    public ByeCommand(String details) throws DukeException {
        if (!details.isBlank()) {
            throw new DukeException(ERROR_MESSAGE);
        }
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        ui.printFarewell();
        storage.saveTasksToFile(tasks);
    }

    @Override
    public boolean isExitCommand() {
        return true;
    }
}
