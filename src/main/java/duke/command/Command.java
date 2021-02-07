package duke.command;

import duke.exception.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public abstract class Command {

    public abstract String getResponse(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    public abstract boolean isExitCommand();
}
