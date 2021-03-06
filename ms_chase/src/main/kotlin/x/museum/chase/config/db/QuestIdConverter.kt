/*
 * Copyright (C) 2020 - museum x, Karlsruhe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package x.museum.chase.config.db

import org.springframework.core.convert.converter.Converter

import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter
import x.museum.chase.entity.QuestId

interface QuestIdConverter {

    @ReadingConverter
    class ReadConverter : Converter<String, QuestId> {
        override fun convert(questId: String): QuestId = QuestId.fromString(questId)
    }

    @WritingConverter
    class WriteConverter : Converter<QuestId, String> {
        override fun convert(questId: QuestId): String? = questId.toString()
    }

}