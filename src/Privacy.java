/**
 * Клас-обробник, що перевіряє статус конфіденційності документа.
 * <p>Перевіряє, чи документ позначений як конфіденційний. Якщо перевірка пройшла, передає запит наступному обробнику.</p>
 *
 * @see Handlers
 * @see Format
 * @see Authorization
 * @see SubmissionTime
 * @see DocumentRequest
 */
public class Privacy implements Handlers {
    private Handlers nextStage;

    /**
     * Обробляє запит, перевіряючи статус конфіденційності.
     * @param documentRequest об'єкт документа, який потрібно перевірити
     */
    public void processRequest(DocumentRequest documentRequest){
        if(documentRequest.getPrivacy() == 1){
            System.out.print(", конфіденційний");
            if (nextStage != null) {
                nextStage.processRequest(documentRequest);
            }
        } else {
            System.out.print("\nДокумент \"" + documentRequest.getFileName() + "\" не конфіденційний. Перевірку зупинено.\n\n");
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
