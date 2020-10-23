package seedu.duke.parser;

import seedu.duke.commands.*;

public class Parser {
    public static Command parserCommand(String userInput) {

        switch (userInput.split(" ")[0]) {
            case AddTodoCommand.COMMAND_WORD:
                return new AddTodoCommand(false, userInput);
            case AddEventCommand.COMMAND_WORD:
                return new AddEventCommand(false, userInput);
            case AddDeadlineCommand.COMMAND_WORD:
                return new AddDeadlineCommand(false, userInput);
//            case DoneCommand.COMMAND_WORD:
//                return DoneCommand(false, userInput);
//            case TaskList.COMMAND_WORD:
//                return TaskList(false, userInput);
            case DeleteCommand.COMMAND_WORD:
                return new DeleteCommand(false, userInput);
            case ByeCommand.COMMAND_WORD:
                return new ByeCommand(true, userInput);
            default:
                System.out.println("\t☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
                return new Command (false, userInput);
        }
    }
}