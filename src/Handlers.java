/**
 * Інтерфейс, що визначає метод для обробки запитів у ланцюжку.
 * <p>Цей інтерфейс є частиною реалізації шаблону "ланцюжок обов'язків".</p>
 *
 * @see Format
 * @see Authorization
 * @see Privacy
 * @see SubmissionTime
 */
public interface Handlers {
    /**
     * Метод для обробки запиту.
     *
     * @param documentRequest об'єкт запиту, який потрібно обробити
     * @see DocumentRequest
     */
    void processRequest(DocumentRequest documentRequest);
}

