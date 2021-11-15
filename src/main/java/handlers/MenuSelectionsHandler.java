package handlers;

public enum MenuSelectionsHandler {
    PRINTSUMOFSALARIES(1),
    PRINTALLEMPLOYEESDATA(2),
    ADDNEWEMPLOYEE(3),
    QUIT(4);

    int action;

    MenuSelectionsHandler(int action) {
        this.action = action;
    }
}

