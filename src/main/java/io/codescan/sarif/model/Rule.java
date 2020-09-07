package io.codescan.sarif.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Rule {

    private String id;

    private String name;

    private MultiformatMessage help;
}
