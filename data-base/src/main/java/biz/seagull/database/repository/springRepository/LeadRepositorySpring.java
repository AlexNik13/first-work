package biz.seagull.database.repository.springRepository;

import biz.seagull.database.model.lead.Lead;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LeadRepositorySpring extends PagingAndSortingRepository<Lead, Long> {
}
