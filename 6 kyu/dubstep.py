# https://www.codewars.com/kata/551dc350bf4e526099000ae5/train/python

# my solution
def song_decoder(song_text):
    decoded_song = ''

    i = 0
    song_length = len(song_text)
    target_element = 'WUB'
    target_element_length = len(target_element)
    while i < song_length:
        if song_text[i : i + target_element_length] == target_element:
            i += target_element_length
            while i < song_length - target_element_length:
                if song_text[i : i + target_element_length] == target_element:
                    i += target_element_length
                else:
                    break
            decoded_song += ' '
        else:
            decoded_song += song_text[i]
            i += 1


    return decoded_song.strip().rstrip()

# other solution
def song_decoder(song):
    if 'WUB' not in song:
        return song
    else: 
        return ' '.join(song.replace('WUB',' ').split())

