package by.emall;

public class LoginMessage {
    public static final String EMPTY_PHONE_XPATH = "/html/body/div[1]/div/div/div[1]/form/div[3]";
    public static final String EMPTY_PASSWORD_XPATH = "/html/body/div[1]/div/div/div[1]/form/div[3]";
    public static final String INVALID_MESSAGE_XPATH = "/html/body/div[1]/div/div/div[1]/form/div[3]";
    public static final String EXPECTED_INVALID_MESSAGE_XPATH = "Неверный логин или пароль";
    public static final String EXPECTED_EMPTY_PHONE_XPATH  = "Поле \"Номер телефона\" обязательно для заполнения.";
    public static final String EXPECTED_EMPTY_PASSWORD_XPATH = "Поле \"Пароль\" обязательно для заполнения.";
    public static final String EXPECTED_EMPTY_FIELDS_XPATH = "Поле \"Номер телефона\" обязательно для заполнения.\n" +
            "Поле \"Пароль\" обязательно для заполнения.";
}
