/**
 * Клас, що інкапсулює дані документа, який потрібно перевірити.
 *
 * @see Format
 * @see Authorization
 * @see Privacy
 * @see SubmissionTime
 */
public class DocumentRequest {
    private String fileName;
    private String format;
    private int authorization;
    private int privacy;
    private int time;

    /**
     * Конструктор класу.
     *
     * @param fileName      назва документа
     * @param format        формат документа (у даній програмі .pdf)
     * @param authorization статус авторизації (1 — авторизований, 0 — ні)
     * @param privacy       статус конфіденційності (1 — конфіденційний, 0 — ні)
     * @param time          час подання (у годинах)
     */
    public DocumentRequest(String fileName, String format, int authorization, int privacy, int time) {
        this.fileName = fileName;
        this.format = format;
        this.authorization = authorization;
        this.privacy = privacy;
        this.time = time;
    }
    /**
     * @return назва документа
     */
    public String getFileName() {
        return fileName;
    }
    /**
     * @return формат документа
     */
    public String getFormat() {
        return format;
    }
    /**
     * @return статус авторизації
     */
    public int getAuthorization() {
        return authorization;
    }
    /**
     * @return статус конфіденційності
     */
    public int getPrivacy() {
        return privacy;
    }
    /**
     * @return час подання документа
     */
    public int getTime() {
        return time;
    }
}
