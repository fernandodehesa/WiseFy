/*
 * Copyright 2018 Patches Klinefelter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.isupatches.wisefy.annotations

import java.lang.annotation.Inherited

/**
 * Denotes that a method is asynchronous with callbacks.
 *
 * @author Patches
 * @since 3.0
 */
@MustBeDocumented
@Target(AnnotationTarget.FUNCTION)
@Inherited
@Retention(AnnotationRetention.RUNTIME)
internal annotation class Async
