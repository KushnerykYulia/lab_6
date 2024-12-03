/**
 * Клас-обробник, що перевіряє авторизацію користувача.
 * <p>Перевіряє, чи користувач авторизований. Якщо перевірка пройшла, передає запит наступному обробнику.</p>
 *
 * @see Handlers
 * @see Format
 * @see Privacy
 * @see SubmissionTime
 * @see DocumentRequest
 */
public class Authorization implements Handlers {
    private Handlers nextStage;

    /**
     * Обробляє запит, перевіряючи статус авторизації.
     * @param documentRequest об'єкт документа, який потрібно перевірити
     */
    public void processRequest(DocumentRequest documentRequest){
        if(documentRequest.getAuthorization() == 1){
            System.out.print(", користувач авторизований");
            if (nextStage != null) {
                nextStage.processRequest(documentRequest);
            }
        } else {
            System.out.print("\nДокумент \"" + documentRequest.getFileName() + "\" надіслав не авторизований користувач. Перевірку зупинено.\n\n");
        }
    }
    /**
     * Встановлює наступний етап обробки.
     * @param nextStage наступний обробник у ланцюжку
     * @see Handlers
     */
    public void setNextStage(Handlers nextStage) {
        this.nextStage = nextStage;
    }
}
