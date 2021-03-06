/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.badlogic.gdx.vr;

import com.google.vrtoolkit.cardboard.ScreenParams;

/**
 * @author Daniel Holderbaum
 */
public class CardboardScreenInformation implements DeviceScreenInformation {

	private ScreenParams screenParams;

	public CardboardScreenInformation(ScreenParams screenParams) {
		this.screenParams = screenParams;
	}

	@Override
	public int getHeight() {
		return screenParams.getHeight();
	}

	@Override
	public float getHeightMeters() {
		return screenParams.getHeightMeters();
	}

	@Override
	public int getWidth() {
		return screenParams.getWidth();
	}

	@Override
	public float getWidthMeters() {
		return screenParams.getWidthMeters();
	}

	@Override
	public float getBorderSizeMeters() {
		return screenParams.getBorderSizeMeters();
	}

}
