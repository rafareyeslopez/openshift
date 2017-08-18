package com.idb.mcore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idb.mcore.domain.Subscription;

@RepositoryRestResource(collectionResourceRel = "subscription", path = "subscription")
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

	/**
	 * Searches the database with the given msisdn.
	 *
	 * @param msisdn
	 * @return Subscription
	 */
	List<Subscription> getByMsisdn(@Param("msisdn") String msisdn);

	@Transactional
	Long deleteByMsisdnAndBillingGuid(@Param("msisdn") String msisdn, @Param("billingGuid") String billingGuid);
}
