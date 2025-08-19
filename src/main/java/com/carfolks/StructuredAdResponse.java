
package com.carfolks;

import java.util.List;

// This record defines the structured JSON output for the car advertisement.
// Using a record provides a concise, immutable data carrier class.
public record StructuredAdResponse(
    String catchyHeadline,
    String shortDescription,
    List<String> keyFeatures,
    String targetAudience
) {}
