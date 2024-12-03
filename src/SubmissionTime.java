/**
 * Клас-обробник, що перевіряє час подання документа.
 * <p>Перевіряє, чи документ подано до 18:00. Якщо перевірка пройшла, завершує ланцюжок.</p>
 *
 * @see Handlers
 * @see Format
 * @see Authorization
 * @see Privacy
 * @see DocumentRequest
 */
public class SubmissionTime implements Handlers {
    private Handlers nextStage;

    /**
     * Обробляє запит, перевіряючи час подання документа.
     * @param documentRequest об'єкт документа, який потрібно перевірити
     */
    public void processRequest(DocumentRequest documentRequest){
        if(documentRequest.getTime() <= 18){
            System.out.print(", надіслано до 18:00. \nДокумент \"" + documentRequest.getFileName() + "\" пройшов перевірку.\n\n");
            if (nextStage != null) {
                nextStage.processRequest(documentRequest);
            }
        } else {
            System.out.print("\nДокумент \"" + documentRequest.getFileName() + "\" надіслано після 18:00. Документ не пройшов перевірку.\n\n");
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


