import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ResourceTitleComparator implements Comparator<Resource> {

    private final Collator collator;

    public ResourceTitleComparator() {
        this(Locale.forLanguageTag("da"));
    }

    public ResourceTitleComparator(Locale locale) {
        this.collator = Collator.getInstance(locale);
    }

    @Override
    public int compare(Resource r1, Resource r2) {
        return collator.compare(r1.getTitle(), r2.getTitle());
    }
}