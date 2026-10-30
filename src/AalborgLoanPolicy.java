import java.time.LocalDate;
import java.util.ArrayList;

public class AalborgLoanPolicy implements LoanPolicy {

    @Override
    public boolean canLoan(Resource resource, ArrayList<Resource> memberResourceList) {

        int movieCounter = 0;
        int videoGameCounter = 0;

        for (var rsrc : memberResourceList) {

            if (rsrc instanceof Movie) {
                movieCounter += 1;

            } else if (rsrc instanceof VideoGame) {
                videoGameCounter += 1;
            }
        }

        if (resource instanceof Movie && movieCounter < 3) {
            return true;

        } else if (resource instanceof VideoGame && videoGameCounter < 3) {
            return true;
        }

        return false;
    }

    @Override
    public LocalDate calculateDueDate(LocalDate borrowedDate, Resource resource) {
        return borrowedDate.plusDays(30);
    }
}