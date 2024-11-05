package design_patterns.template.data_validation;

class EmailValidator extends DataValidator {
    @Override
    protected boolean isValidFormat(String data) {
        return data.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}


class PhoneNumberValidator extends DataValidator {
    @Override
    protected boolean isValidFormat(String data) {
        return data.matches("^\\+?[0-9]{10,15}$");
    }
}