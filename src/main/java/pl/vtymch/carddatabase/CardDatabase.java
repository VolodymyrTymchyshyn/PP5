package pl.vtymch.carddatabase;

import pl.vtymch.creditcard.CardMemory;
import pl.vtymch.creditcard.CreditCard;

import java.util.Optional;

public class CardDatabase implements CardMemory {
    @Override
    public void save(CreditCard card) {

    }

    @Override
    public Optional<CreditCard> findByNumber(String s) {
        return Optional.empty();
    }
}
