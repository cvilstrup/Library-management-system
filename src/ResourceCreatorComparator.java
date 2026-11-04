import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class ResourceCreatorComparator implements Comparator<Resource> {

    private final Collator collator;

    public ResourceCreatorComparator() {
        this(Locale.forLanguageTag("da"));
    }

    public ResourceCreatorComparator(Locale locale) {
        this.collator = Collator.getInstance(locale);
    }

    @Override
    public int compare(Resource r1, Resource r2) {
        return collator.compare(r1.getCreator(), r2.getCreator());
    }
}
