package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.person.Person;
import seedu.address.model.table.Table;
import seedu.address.model.wedding.Wedding;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyAddressBook {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();
    ObservableList<Table> getTableList();
    ObservableList<Wedding> getWeddingList();

    // Returns the single wedding, or null if none
    Wedding getCurrentWedding();
    boolean hasCurrentWedding();
}
