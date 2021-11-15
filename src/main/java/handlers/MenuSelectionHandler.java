package handlers;

public enum MenuSelectionHandler {
    PRINTSUMOFSALARIES(1),
    PRINTALLEMPLOYEESDATA(2),
    ADDNEWEMPLOYEE(3),
    QUIT(4);

    int action;

    MenuSelectionHandler(int action) {
        this.action = action;
    }
}

