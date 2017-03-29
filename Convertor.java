
public class Convertor {
    public static String convertToDays(int days) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(days);
        if (days > 1)
            stringBuilder.append(" days");
        else
            stringBuilder.append(" day");
        return stringBuilder.toString();
    }

    public static String convertToCurrency(int price) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(price);
        return stringBuilder.toString();
    }
}