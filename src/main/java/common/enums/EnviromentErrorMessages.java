package common.enums;

public enum EnviromentErrorMessages {
    ERROR_OPERATING_SYSTEM ("The current OS is not specified in the list.");
    private  final  String errorMessage;

    EnviromentErrorMessages(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
