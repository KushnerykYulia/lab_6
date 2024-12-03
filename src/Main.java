/**
 * Головний клас програми, який формує ланцюжок обробників та виконує перевірку документів.
 *
 * @see Handlers
 * @see Format
 * @see Authorization
 * @see Privacy
 * @see DocumentRequest
 *
 * @author Кушнерик Юлія
 */
public class Main {
    public static void main(String[] args) {
        Format format = new Format();
        Authorization authorization = new Authorization();
        Privacy privacy = new Privacy();
        SubmissionTime submissionTime = new SubmissionTime();

        format.setNextStage(authorization);
        authorization.setNextStage(privacy);
        privacy.setNextStage(submissionTime);

        DocumentRequest document1 = new DocumentRequest("Лабараторна робота 2", "pdf", 1, 1, 20);
        DocumentRequest document2 = new DocumentRequest("Презентація", "pptx", 1, 1, 6);
        DocumentRequest document3 = new DocumentRequest("Реферат", "pdf", 1, 1, 15);
        DocumentRequest document4 = new DocumentRequest("Практична робота 4", "pdf", 1, 0, 19);

        format.processRequest(document1);
        format.processRequest(document2);
        format.processRequest(document3);
        format.processRequest(document4);
    }
}
