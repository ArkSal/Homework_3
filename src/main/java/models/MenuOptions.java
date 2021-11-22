package models;

public enum MenuOptions {
    PRINTSUMOFSALARIES(1),
    PRINTALLEMPLOYEESDATA(2),
    ADDNEWEMPLOYEE(3),
    QUIT(4);

    int action;

    MenuOptions(int action) {
        this.action = action;
    }
}

