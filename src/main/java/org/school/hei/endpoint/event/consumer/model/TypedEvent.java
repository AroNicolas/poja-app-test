package org.org.school.endpoint.event.consumer.model;

import org.org.school.PojaGenerated;
import org.org.school.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
