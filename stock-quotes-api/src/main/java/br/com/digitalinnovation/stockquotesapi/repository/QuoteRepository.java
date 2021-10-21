package br.com.digitalinnovation.stockquotesapi.repository;

import br.com.digitalinnovation.stockquotesapi.entity.Quote;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends ReactiveSortingRepository<Quote, Long> {
}
