package com.keijack.database.hibernate;

import java.util.List;

import com.keijack.database.hibernate.stereotype.ComparisonType;
import com.keijack.database.hibernate.stereotype.EmbedType;
import com.keijack.database.hibernate.stereotype.QueryCondition;
import com.keijack.database.hibernate.stereotype.QueryParamsFor;

/**
 * @author Keijack
 *
 */
@QueryParamsFor(value = TestModel.class, alias = "testModel")
public class ListTestModelCallEmbed {

    @QueryCondition(field = "strValue",
	    comparison = ComparisonType.LIKE,
	    preString = "%",
	    emptyAsNull = true,
	    embedType = EmbedType.OR)
    private List<String> strValueEndWithOr;

    public List<String> getStrValueEndWithOr() {
	return strValueEndWithOr;
    }

    public void setStrValueEndWithOr(List<String> strValueEndWithOr) {
	this.strValueEndWithOr = strValueEndWithOr;
    }

}
