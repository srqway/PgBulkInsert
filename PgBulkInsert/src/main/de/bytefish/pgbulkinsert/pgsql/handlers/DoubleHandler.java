// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.pgbulkinsert.de.bytefish.pgbulkinsert.pgsql.handlers;

import java.io.DataOutputStream;

public class DoubleHandler extends BaseValueHandler<Double> {

    @Override
    protected void internalHandle(DataOutputStream buffer, final Double value) throws Exception {
        buffer.writeInt(8);
        buffer.writeDouble(value);
    }
}
