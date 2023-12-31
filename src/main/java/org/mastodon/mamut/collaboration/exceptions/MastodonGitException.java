package org.mastodon.mamut.collaboration.exceptions;

import org.mastodon.mamut.collaboration.MastodonGitRepository;

/**
 * Exception class that is used in
 * {@link MastodonGitRepository}.
 * The exception messages should be user-friendly. Such that they can be
 * printed to the user.
 */
public class MastodonGitException extends RuntimeException
{
	public MastodonGitException( final String message )
	{
		super( message );
	}

	public MastodonGitException( final String message, final Throwable cause )
	{
		super( message, cause );
	}
}
