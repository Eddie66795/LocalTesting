-------------------------------
ISO 8601 Formatting Symbols
-------------------------------
The following list explains the formatting symbols that are used to notate the ISO 8601 dates, time, datetime, durations, and interval values:

Symbol: n
Description: Specifies a number that represents the number of years, months, or days

Symbol: P
Description: Indicates that the duration that follows is specified by the number of years, months, days, hours, minutes, and seconds

Symbol: T
indicates that a time value follows. Any value with a time must begin with T.

Requirement:	Time values that are read by the extended notation informats that begin with the characters E8601 must use an uppercase T.

Symbol: W
Description: Indicates that the duration is specified in weeks.

Symbol: Z
Description: Indicates that the time value is the time in Greenwich, England, or UTC time.

Symbol: +|-
Description: The + indicates the time zone offset to the east of Greenwich, England. The - indicates the time zone offset to the west of Greenwich, England.

Symbol: yyyy
Description: Specifies a four-digit year

Symbol: mm
Description: As part of a date, specifies a two-digit month, 01 - 12

Symbol: dd
Description: Specifies a two-digit day, 01 - 31

Symbol: hh
Description: Specifies a two-digit hour, 00 - 24

Symbol: mm
Description: As part of a time, specifies a two-digit minute, 00 - 59

Symbol: ss
Description: Specifies a two-digit second, 00 - 59

Symbol: fff | ffffff
Description: Specifies an optional fraction of a second using the digits 0 - 9:

Symbol: fff
Description: Use 1 - 3 digits for values read by the $N8601B informat and the $N8601E informat

Symbol: ffffff
Description: Use 1 - 6 digits for informat other than the $N8601B informat and the $N8601E informat

Symbol: Y
Description: Indicates that a year value proceeds this character in a duration

Symbol: M
Description: As part of a date, indicates that a month value proceeds this character in a duration

Symbol: D
Description: Indicates that a day value proceeds this character in a duration

Symbol: H
Description: Indicates that an hour value proceeds this character in a duration

Symbol: M
Description: As part of a time, indicates that a minute value proceeds this character in a duration

Symbol: S
Description: Indicates that a seconds value proceeds this character in a duration