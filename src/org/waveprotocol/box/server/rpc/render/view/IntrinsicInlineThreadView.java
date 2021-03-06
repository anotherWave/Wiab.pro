/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.waveprotocol.box.server.rpc.render.view;

/**
 * Reveals the primitive state exposed in an inline thread view.
 * 
 * @see InlineThreadView for structural state.
 */
public interface IntrinsicInlineThreadView extends IntrinsicThreadView {

  /** Sets the collapsed state of this view. */
  void setCollapsed(boolean collapsed);

  /** @return true if this view is collapsed, false if expanded. */
  boolean isCollapsed();
}
