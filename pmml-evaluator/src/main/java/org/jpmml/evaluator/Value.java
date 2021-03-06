/*
 * Copyright (c) 2017 Villu Ruusmann
 *
 * This file is part of JPMML-Evaluator
 *
 * JPMML-Evaluator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JPMML-Evaluator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with JPMML-Evaluator.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jpmml.evaluator;

import java.util.List;

abstract
public class Value<V extends Number> {

	abstract
	public Value<V> copy();

	abstract
	public Value<V> add(double value);

	abstract
	public Value<V> add(Value<?> value);

	abstract
	public Value<V> add(Number factor, int exponent, double coefficient);

	abstract
	public Value<V> add(List<? extends Number> factors, double coefficient);

	abstract
	public Value<V> subtract(double value);

	abstract
	public Value<V> subtract(Value<?> value);

	abstract
	public Value<V> multiply(double value);

	abstract
	public Value<V> multiply(Value<?> value);

	abstract
	public Value<V> divide(double value);

	abstract
	public Value<V> divide(Value<?> value);

	abstract
	public Value<V> restrict(double lowValue, double highValue);

	abstract
	public Value<V> round();

	abstract
	public Value<V> ceiling();

	abstract
	public Value<V> floor();

	abstract
	public Value<V> logit();

	abstract
	public Value<V> probit();

	abstract
	public Value<V> exp();

	abstract
	public Value<V> cloglog();

	abstract
	public Value<V> loglog();

	abstract
	public Value<V> cauchit();

	abstract
	public Value<V> residual(Value<?> value);

	abstract
	public float floatValue();

	abstract
	public double doubleValue();

	abstract
	public V getValue();
}