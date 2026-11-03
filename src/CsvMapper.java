public interface CsvMapper<T> {
    T fromCsv(String line);
    String toCsv(T item);
}
