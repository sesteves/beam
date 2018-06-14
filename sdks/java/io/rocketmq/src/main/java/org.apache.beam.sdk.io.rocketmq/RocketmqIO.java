/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.io.rocketmq;

import com.google.auto.value.AutoValue;
import org.apache.beam.sdk.annotations.Experimental;
import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.PBegin;
import org.apache.beam.sdk.values.PCollection;

import java.util.ArrayList;

/**
 *
 */
@Experimental(Experimental.Kind.SOURCE_SINK)
public class RocketmqIO {

    /**
     *
     */
    public static <K, V> Read<K, V> read() {
        return new AutoValue_RocketmqIO_Read.Builder<K, V>()
                .build();
    }


    /**
     * A {@link PTransform} to read from RocketMQ topics. See {@link RocketmqIO} for more information on
     * usage and configuration.
     */
    @AutoValue
    public abstract static class Read<K, V> extends PTransform<PBegin, PCollection<KafkaRecord<K, V>>> {

    }


}
