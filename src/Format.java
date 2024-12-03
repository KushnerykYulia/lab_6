/**
 * Клас-обробник, що перевіряє формат документа.
 * <p>Перевіряє, чи формат документа відповідає значенню "pdf". Якщо перевірка пройшла, передає запит наступному обробнику.</p>
 *
 * @see Handlers
 * @see Authorization
 * @see Privacy
 * @see SubmissionTime
 * @see DocumentRequest
 */
public class Format implements Handlers {
    private Handlers nextStage;

    /**
     * Обробляє запит, перевіряючи формат документа.
     * @param documentRequest об'єкт документа, який потрібно перевірити
     */
    public void processRequest(DocumentRequest documentRequest){
        if(documentRequest.getFormat().equals("pdf")){
            System.out.print("Документ \"" + documentRequest.getFileName() + "\" має правильний формат");
            if (nextStage != null) {
                nextStage.processRequest(documentRequest);
            }
        } else {
            System.out.print("Неправильний формат документа \"" + documentRequest.getFileName() + "\". Перевірку зупинено. \n\n");
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
