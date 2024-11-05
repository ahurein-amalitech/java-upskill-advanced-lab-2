package design_patterns.template.data_validation;

abstract class DataValidator {

    public final boolean validate(String data) {
        if (!isEmpty(data)) {
            if (isValidFormat(data)) {
                System.out.println("Validation passed.");
                return true;
            } else {
                System.out.println("Invalid format.");
                return false;
            }
        } else {
            System.out.println("Data cannot be empty.");
            return false;
        }
    }

    protected boolean isEmpty(String data) {
        return data == null || data.isEmpty();
    }

    protected abstract boolean isValidFormat(String data);
}
