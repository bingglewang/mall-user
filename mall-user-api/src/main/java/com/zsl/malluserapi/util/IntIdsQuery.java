package com.zsl.malluserapi.util;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class IntIdsQuery {
    /**
     * ID数组
     */
    @NotEmpty(message = "至少选择一个")
    private Set<Integer> ids;

    public List<Integer> getIds() {
        return new ArrayList<>(ids);
    }
}
