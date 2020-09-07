package io.codescan.sarif.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Static Analysis Results.
 */
@Data
@Accessors(chain = true)
public class SarifLog {

    /**
     * The URI of the JSON schema corresponding to the version.
     */
    @JsonProperty("$schema")
    private String schema = "https://raw.githubusercontent.com/oasis-tcs/sarif-spec/master/Schemata/sarif-schema-2.1.0.json";

    /**
     * The SARIF format version of this log file.
     */
    private String version = "2.1.0";

    /**
     * The set of runs contained in this log file.
     */
    private List<Run> runs;


}
