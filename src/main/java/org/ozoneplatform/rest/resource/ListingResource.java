package org.ozoneplatform.rest.resource;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import org.ozoneplatform.entity.Listing;

import org.ozoneplatform.service.ListingService;

@Path("listing")
@Component
@Produces({
    "application/vnd.ozp.store.listing+json",
    "application/vnd.ozp.store.listing.simple+json",
    "application/json"
})
public class ListingResource extends AbstractEntityResource<Listing> {
    @Autowired
    public ListingResource(ListingService service) {
        this.service = service;
    }
}
