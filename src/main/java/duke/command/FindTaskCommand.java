package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.Task;
import duke.task.TaskList;
import duke.ui.Ui;

import java.util.List;

public class FindTaskCommand extends Command {
    private String keyword;

    private static final String NO_KEYWORD_ERROR_MESSAGE = "I can't find a ask without you giving me a keyword.";

    public FindTaskCommand(String keyword) throws DukeException {
        if (keyword.isBlank()) {
            throw new DukeException(NO_KEYWORD_ERROR_MESSAGE);
        }
        this.keyword = keyword;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        TaskList foundTasks = tasks.findTask(keyword);
        ui.printAllFoundTasks(foundTasks);
    }

    @Override
    public boolean isExitCommand() {
        return false;
    }
}
